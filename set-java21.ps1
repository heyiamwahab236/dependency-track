# set-java21.ps1
# Update the path below if your JDK 21 is installed elsewhere
$env:JAVA_HOME = "C:\Program Files\Java\jdk-21"
$env:Path = "$env:JAVA_HOME\bin;" + $env:Path
Write-Host "JAVA_HOME set to $env:JAVA_HOME"
java -version
