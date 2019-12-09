;open application
Run("calc.exe")
;Sleep
Sleep(1000)
;Activate window
WinActivate("[Title:Calculator]","")
;click on 5
ControlClick("[Title:Calculator]","","Button10")
;Sleep
Sleep(1000)
;click on 6
ControlClick("[Title:Calculator]","","Button15")
;Sleep
Sleep(1000)










