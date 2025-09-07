aux = input('Digite o raio do círculo: ');
raio = float(aux);

pi = 3.141592;

area = pi * (raio ** 2);
perimetro = 2 * pi * raio;

print(f'Área do círculo: {area: .2f}')
print(f'Perímetro do círculo: {perimetro: .2f}'); #O ".2f" serve para limitar a saída a 2 casas decimais