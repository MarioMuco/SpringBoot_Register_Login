# Platformë web per autentikimin e perdoruesit

1. Infrastruktura në docker

a. Eshte ndertuar nje imazh per webservirin dhe nje oimazh per databazen

b. Eshte konfiguruar komunikimi mes tyre me ane te docker-compose

3. Platforma Web
   
a. Teknokogjia: SpringBoot, Thymeleaf

b. Moduli i autentikimit te userit duke vendosur email dhe password.
c. Moduli i rregjistrimit të useri. Të dhënat: emri, atësia, mbiemri, nr tel, datëlindja, email, password.

d. Pas autentikimit useri ridrejtohet drejt profilit të tij. 
	Në seksionin e profilit useri sheh të dhënat e tij dhe mund ti modifikojë ato.
 
e. Në platformë autentikohet një user me rolin e administratorit. 
	Administratorit të sistemit i listohen të gjithë userat e rregjistruar në formën e një tabele. Administratori mund të modifikojë të dhënat e një përdoruesi.

f. Të validohen të dhënat e userit në modulin e rregjistrimit dhe në profilin e tij: emri, atësia, mbiemri: shkronja dhe max 20 karaktere.  datëlindja: datë, emaili: lejohet vetëm nje format i tipit email, password: minimumi 8 karaktere,

