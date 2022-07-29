call runcrud.bat
if "%ERRORLEVEL%" == "0" goto openurl
echo.
echo runcrud has errors – breaking work
goto fail

:openurl
start chrome http://localhost:8080/crud/v1/task/tasks
if "%ERRORLEVEL%" == "0" goto end
echo.
echo Cannot open url
goto fail
goto end

:fail
echo.
echo There were errors

:end
echo.
echo Work is finished.