nombre=input("DIGITE SU NOMBRE: ")
apellido=input("DIGITE SU APELLIDO: ")
edad=int(input("DIGITE SU EDAD: "))
sexo=int(input("DIGITE SU SEXO:\n 1.MASCULINO\n 2.FEMENINO\n"))

print("\n|NOMBRE: ",nombre)
print("|APELLIDO: ",apellido)
if(edad>=18):
    print("|-USTED ES MAYOR DE EDAD")
else:
    print("|-USTED ES MENOR DE EDAD")

if(sexo==1):
    print("|-USTED ES HOMBRE" )
else:
    if(sexo==2):
        print("|-USTED ES MUJER")
    else:
        print("|DIGITE VALORES VALIDOS PARA LA VARIABLE 'SEXO' ")                