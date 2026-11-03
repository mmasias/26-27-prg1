import random
 
# El viaje de Marco (con la extensión 1 y la extensión 2)
 
distancia = 350   # km que separan a Marco de su madre al principio
dia = 0
 
print("DIARIO DEL VIAJE DE MARCO")
print("=========================")
 
while distancia > 0:
    dia = dia + 1
    print("DIA", dia)
 
    # ---------- MARCO ----------
    velocidad_marco = random.uniform(10, 15)
    horas_marco = random.uniform(8, 10)
 
    # Clima de Marco
    clima = random.random()
    if clima < 0.10:
        print("¡Ha llovido muchísimo!")
        velocidad_marco = velocidad_marco * 0.25
    elif clima < 0.40:
        print("Ha llovido un poco")
        velocidad_marco = velocidad_marco * 0.75
    else:
        print("Ha hecho un buen día")
 
    # El mono Amedio (los dos sucesos pueden pasar el mismo día)
    if random.random() < 0.15:
        print("¡He perdido tiempo buscando a Amedio!")
        horas_marco = horas_marco - 2
    if random.random() < 0.25:
        print("Amedio se ha cansado y lo llevo en brazos")
        velocidad_marco = velocidad_marco * 0.90
 
    km_marco = horas_marco * velocidad_marco
    print(f"Avance {horas_marco:.2f} horas a {velocidad_marco:.2f} Km/h recorriendo {km_marco:.2f} Km")
 
    # ---------- MADRE ----------
    velocidad_madre = random.uniform(6, 9)
    horas_madre = random.uniform(6, 9)
 
    # Clima de la madre
    clima = random.random()
    if clima < 0.10:
        print("A mamá le ha llovido muchísimo")
        velocidad_madre = velocidad_madre * 0.50
    elif clima < 0.40:
        print("A mamá le ha llovido un poco")
        velocidad_madre = velocidad_madre * 0.75
    else:
        print("A mamá le ha hecho un buen día")
 
    km_madre = horas_madre * velocidad_madre
    print(f"Mama pudo avanzar {horas_madre:.2f} horas a {velocidad_madre:.2f} Km/h recorriendo {km_madre:.2f} Km")
 
    # ---------- DISTANCIA ----------
    # Marco se acerca y la madre se aleja
    distancia = distancia - km_marco + km_madre
 
    # Extensión 2: si están cerca, puede que alguien le diga a Marco que la ha visto
    if distancia < 50:
        if random.random() < 0.5:
            print("A Marco le dicen que han visto a su mamá, y rompe a correr!!!")
            distancia = distancia - 25
 
    if distancia > 0:
        print(f"Al final del día {dia} la distancia entre Marco y su Madre es de {distancia:.2f} Km")
        print("- " * 34)
 
print("*" * 60)
print(f"Al final del día {dia} Marco encuentra a su madre!!!")
print("*" * 60)
 
