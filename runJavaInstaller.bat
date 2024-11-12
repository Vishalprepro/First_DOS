@echo off
:: Check if Java is installed
java -version >nul 2>&1
IF %ERRORLEVEL% NEQ 0 (
    echo Java is not installed. Installing Java...
    :: Download JDK installer
    powershell -Command "(New-Object System.Net.WebClient).DownloadFile('https://download.java.net/java/early_access/jdk15/16/GPL/openjdk-15+36_windows-x64_bin.exe', 'jdk-installer.exe')"

    :: Run the JDK installer silently
    echo Running JDK installer...
    start /wait jdk-installer.exe /s

    :: Wait for the installation to finish (this can be adjusted based on download speed)
    echo Java installation completed. Proceeding to run the program...
    timeout /t 10 /nobreak >nul
)

:: After installation (or if Java was already installed), run the Java program
echo Running the Java program...
java JavaInstaller

:: Pause the script to keep the window open and show any messages
pause
