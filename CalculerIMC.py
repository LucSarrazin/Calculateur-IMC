poids = float(input("Entez votre poids en KG "))
taille = int(input("Entrez votre taille en CM ")) / 100

IMC = poids / (taille**2)
IMC = round(IMC,1)

if IMC <=  15.9:
    print("Vous êtes actuellement extrêmement maigre avec un IMC de : " + str(IMC))

elif  16.0 <= IMC <= 18.9:
    print("Vous êtes actuellement maigre avec un IMC de : " + str(IMC))

elif  19.0 <= IMC <= 20.9:
    print("Vous êtes actuellement mince avec un IMC de : " + str(IMC))

elif  21.0 <= IMC <= 24.9:
    print("Vous êtes actuellement normal avec un IMC de : " + str(IMC))

elif 25.0 <= IMC <= 29.9:
    print("Vous êtes actuellement en surpoids avec un IMC de : " + str(IMC))

elif 30.0 <= IMC <= 34.9 :
    print("Vous êtes actuellement en obésité modérée avec un IMC de : " + str(IMC))

elif 35.0 <= IMC <= 39.9 :
    print("Vous êtes actuellement en obésité sévère avec un IMC de : " + str(IMC))

elif IMC >= 40.0 :
    print("Vous êtes actuellement en obésité massive avec un IMC de : " + str(IMC))
