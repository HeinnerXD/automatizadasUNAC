Feature: Prueba de Login
	Yo como usuario de SDETraining
	Quiero que cuando ingrese a la pagina de Login
	Me pueda loguear
	
Scenario Outline: el usuario se puede logear con credenciales validas
	Given el usuario esta en la pagina de login
	When el usuario ingresa credenciales validas "<email>"
	And y el password "<password>"
	Then el usuario puede ver su panel de administracion "<message>"
	
	Examples: |email										|password					|message								|
						|heinner45@gmail.com			|Takeshixd1999		|Logged in successfully	|
		
#Scenario Outline: el usuario no se puede logear con credenciales invalidas4
#	Given el usuario esta en la pagina de login
	#When el usuario ingresa credenciales invalidas "<email>"
	#And y el password "<password>"
	#Then el usuario no puede ver su panel de administracion "<message>"
#	
	#Examples: 
	#	|email										|password					|message											|
	#	|heinner45@gmail.com			|Takeshixd1998		|Invalid password, try again!	|