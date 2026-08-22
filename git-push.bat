@echo off
setlocal

set /p msg="Enter commit message: "

echo.
echo [1/3] Adding changes...
git add .
if errorlevel 1 goto :error

echo [2/3] Committing...
git commit -m "%msg%"
if errorlevel 1 goto :error

echo [3/3] Pushing...
git push
if errorlevel 1 goto :error

echo.
echo =========================
echo   PUSH SUCCESSFUL
echo =========================
pause
exit /b 0

:error
echo.
echo =========================
echo   GIT OPERATION FAILED
echo =========================
pause
exit /b 1