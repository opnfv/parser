<!-- (c) Copyright [2015] Hewlett-Packard Development Company, L.P.;-->
<xsl:stylesheet version="1.0" xmlns:ns="urn:ietf:params:xml:ns:yang:yin:1" xmlns:y="urn:ietf:params:xml:ns:yang:ietf-vdus" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" exclude-result-prefixes="t">
<xsl:output indent="no" method ="text"/>

	<xsl:variable name="tosca_general">
    <entry key="tosca_definitions_version">tosca_definitions_version: tosca_simple_yaml_1_0_0</entry>
    <entry key="tosca_default_namespace">tosca_default_namespace: tosca_simple_yaml_1_0_0</entry>
    <entry key="template_name">template_name: </entry>
    <entry key="description">description:></entry>
    <entry key="template_author">template_author: </entry>
    <entry key="template_version">template_version:</entry>
    <entry key="derived">derived_from: tosca.nodes.Root</entry>
    <entry key="import">import: </entry>
 </xsl:variable>
 <xsl:variable name="nodeTypes">
    <entry key="general">type:tosca.nodes.general</entry>
    <entry key="generalvdus">type: tosca.nodes.general.vdus</entry>
    <entry key="compute">type: tosca.nodes.compute</entry>
    <entry key="storage">type: tosca.nodes.block.Storage</entry>
    <entry key="network">type: tosca.nodes.network</entry>
    <entry key="security">type: tosca.nodes.security</entry>
    <entry key="policy">type:tosca.nodes.policy</entry>
 </xsl:variable> 
 
 <xsl:variable name="nodeTemplates">
     <entry key="node_template">node_templates:</entry>
     <entry key="property">properties:</entry>
    <entry key="general">General_Details:</entry>
    <entry key="generalvdus">General_Details_vdus:</entry>    
    <entry key="compute">Compute_Details:</entry>
    <entry key="storage">Storage_Details:</entry>
    <entry key="network">Network_Details</entry>
    <entry key="security">Security_Details:</entry>
    <entry key="policy">Policy_Details:</entry>
  
 </xsl:variable> 
 <xsl:variable name="service_properties">
 	<entry key="service_properties">service_properties</entry>
 	<entry key="ID">ID: </entry>
 	<entry key="vendor">vendor: </entry>
 	<entry key="version">version: </entry> 
 	
  </xsl:variable>
<xsl:template match="ns:module">
<xsl:value-of select="concat(document('')//xsl:variable[@name='tosca_general']/entry[@key='tosca_definitions_version'] ,'&#x0A;')" />
<xsl:value-of select="concat(document('')//xsl:variable[@name='tosca_general']/entry[@key='description'],'&#x0A;&#x09;',ns:description/node()/text(),'&#x0A;')" />
<xsl:value-of select="concat(document('')//xsl:variable[@name='tosca_general']/entry[@key='import'],'&#x0A;&#x09;',ns:import/@module,'&#x0A;')" />
<xsl:for-each select="ns:container">
	<xsl:choose>
		<xsl:when test="@name='monitor-paras'">
monitor-parameter:
		</xsl:when>
		<xsl:when test="@name='connection-points'">
connection-points:
		</xsl:when>
		<xsl:otherwise>
dsl_definitions:<xsl:for-each select="ns:list">			
	compute_props_host_<xsl:value-of select="@name"/>: <text disable-output-escaping="yes"><![CDATA[&]]>compute_props_host_</text><xsl:value-of select="@name"/>
	<xsl:for-each select="ns:container"><xsl:if test="@name = 'resource'"><xsl:for-each select="ns:container"><xsl:if test="@name = 'cpu'"><xsl:variable name="num_cpu" select="ns:leaf/ns:type/ns:range/@value"/>
	 	 num_cpu:<xsl:value-of select="$num_cpu"/>
        			    </xsl:if>
        			 	<xsl:if test="@name='memory'">
						<xsl:variable name="memory" select="ns:leaf/ns:type/ns:range/@value"/>
		 mem_size:<xsl:value-of select="$memory"></xsl:value-of>				
						</xsl:if>
						<xsl:if test="@name='disk'">
						<xsl:variable name="disk" select="ns:leaf/ns:type/ns:range/@value"/>
		 disk_size:<xsl:value-of select="$disk"></xsl:value-of>				
						</xsl:if>
        			</xsl:for-each>
        		</xsl:if>
        	</xsl:for-each>
   		</xsl:for-each>
node_types:<xsl:for-each select="ns:list">
	tosca.nodes.compute.<xsl:value-of select="@name"/>:
		derived_from: tosca.nodes.compute
</xsl:for-each>
topology_template:
		# a description of the topology template 
		description: >
			<xsl:value-of select="../../ns:description/node()/text()"/>
	node_templates:<xsl:for-each select="ns:list">
			<xsl:text>&#xa;&#x9;&#x9;</xsl:text>
			<xsl:value-of select="@name"/>:
			type:tosca.nodes.Compute
			capabilities:
				os:
					properties: *compute_props_os_DEF
				host:
					properties: *compute_props_host_<xsl:value-of select="@name"/>
				scalable:
					properties:
						min_instances:<xsl:for-each select="ns:leaf"><xsl:if test="@name = 'instance-num'">
						<xsl:value-of select="ns:default/@value"/>					
						</xsl:if></xsl:for-each>				
						default_instances:<xsl:for-each select="ns:leaf"><xsl:if test="@name = 'instance-num'">
						<xsl:value-of select="ns:default/@value"/>					
						</xsl:if></xsl:for-each>
						<xsl:text>&#xa;&#x9;</xsl:text>
			interfaces:<xsl:for-each select="ns:container">
					<xsl:if test="@name = 'workflow-script'">
				<xsl:for-each select="ns:leaf">
				<xsl:choose>
				<xsl:when test="@name = 'init'">
				start:
					implementation: <xsl:value-of select="ns:default/@value"/>
						</xsl:when>
				<xsl:when test="@name='terminate'">
				delete:
					implementaion: <xsl:value-of select="ns:default/@value"/>
				</xsl:when>
				<xsl:when test="@name='graceful-shutdown'">
				stop:
					implementaion: <xsl:value-of select="ns:default/@value"/>
				</xsl:when>
						</xsl:choose>
						 </xsl:for-each>
						</xsl:if>
						</xsl:for-each>
		<xsl:text>&#xa;&#x9;&#x9;</xsl:text>
		<xsl:value-of select="@name"/>_BlockStorage:
			type: tosca.nodes.BlockStorage	
			properties: 
				size: { get_input: omm_storage_size } 
		</xsl:for-each>	
		<xsl:for-each select="ns:list">
		<xsl:for-each select="ns:container">
		<xsl:if test="@name = 'resource'">
        			<xsl:for-each select="ns:container">
        			<xsl:if test="@name='vnic'">
						<xsl:variable name="vnic" select="ns:leaf/ns:type/ns:range/@value"/>
						<xsl:call-template name="nic.loop">
						<xsl:with-param name="from" select="1"/>
						<xsl:with-param name="to" select="$vnic"/>
						</xsl:call-template>
					</xsl:if>
					</xsl:for-each>
		</xsl:if>					
		</xsl:for-each>		
		</xsl:for-each>
			</xsl:otherwise>
</xsl:choose>
</xsl:for-each>
</xsl:template>
<xsl:template name="nic.loop">
<xsl:param name="from"/>
    <xsl:param name="to"/>
    <xsl:if test="$from &lt;= $to">
    <xsl:text>&#xa;&#x9;</xsl:text>
    <xsl:value-of select="../../../@name"/>_network<xsl:value-of select="$from"/>:
			type: tosca.nodes.network.Network
			properties:
			ip_version: 4
			cidr: {  }
			network_name: {  }
			start_ip: {  }
			end_ip: {  }
	<xsl:value-of select="../../@name"/>_port<xsl:value-of select="$from"/>:
			type: tosca.nodes.network.Port
			requirements:
				- binding:
					node:<xsl:value-of select="../../@name"/>
				- link:
					 node:<xsl:value-of select="../../../@name"/>_network<xsl:value-of select="$from"/>
		<xsl:call-template name="nic.loop">
		<xsl:with-param name="from" select="$from + 1"/>
		<xsl:with-param name="to" select="$to"/>
		</xsl:call-template>
      
    </xsl:if>
</xsl:template>
</xsl:stylesheet>