aux = input('Digite o valor do produto: ');
preco = float(aux);

aux = input('Digite o percentual de desconto ou aumento (sem o %): ');
percentual = float(aux);

print(f'Valor original: R$ {preco: .2f}');
print(f'Percentual: {percentual: .2f}%');
print(f'Produto com desconto: R$ {preco - (preco * percentual / 100): .2f}');
print(f'Produto com aumento: R$ {preco + (preco * percentual / 100): .2f}');