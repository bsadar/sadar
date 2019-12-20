/*; Run Notepad - To Open the application
Run("notepad.exe")
;Activate Note pad
WinActivate("[Title:Untitled - Notepad]","")
;wait some Time
Sleep(500)
;type data
ControlSetText("[Title:Untitled - Notepad]","","Edit1","QAPlanet")
;wait some Time
Sleep(3000)
; close Notepad
WinClose("[CLASS:Notepad]","")
*/