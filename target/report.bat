@echo off
call echo Gerando relatorio ...
call allure generate --clean

call echo Abrindo relatorio ...
call allure serve


