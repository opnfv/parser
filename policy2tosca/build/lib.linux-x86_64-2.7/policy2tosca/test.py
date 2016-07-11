import subprocess

print ('\nread:')
proc = subprocess.Popen(['./sample_shell.sh'],shell=True,stdin=subprocess.PIPE,stdout=subprocess.PIPE,)
stdout_value = proc.communicate()[0]
print ('\tstdout:', repr(stdout_value))
