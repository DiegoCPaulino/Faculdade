aux = input('Quantas camisetas você possui: ');
num = int(aux);

aux = input('Quantas calças você possui: ');
num2 = int(aux);

aux = input('Quantos sapatos você possui: ');
num3 = int(aux);

possibilidades = num * num2 * num3;

print(f'Você pode criar {possibilidades} combinações diferentes de roupas.')