aux = input('Digite seu nome: ');
nome = aux;

aux = input('Digite o ANO em que você nasceu: ');
anoNascimento = int(aux);

idade = 2024 - anoNascimento;
print(nome,'em 2024 você tinha', idade, 'anos');