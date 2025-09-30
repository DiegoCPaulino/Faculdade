dentistas = []
pacientes = []

USUARIO = "usertdb"
SENHA = "0000"

def cadastroPaciente():
    while True:
        paciente = {}

        print("\nCadastro de Paciente")
        paciente["nomeCompleto"] = input("Nome completo: ")
        paciente["cpf"] = input("CPF (somente números): ")
        paciente["telefone"] = input("Telefone: ")
        paciente["email"] = input("E-mail: ")

        print("\nAqui estão os dados que você forneceu:")
        for chave, valor in paciente.items():
            print(f"{chave}: {valor}")

        confirmar = input("\nTem certeza que deseja adicionar esse paciente ao sistema?"
                          "\n1 - Confirmar e adicionar"
                          "\n2 - Refazer formulário"
                          "\n3 - Cancelar e voltar ao menu principal"
                          "\nDigite sua escolha: ")
        if confirmar == "1":
            pacientes.append(paciente)
            print(f"\nMaravilha! O paciente {paciente['nomeCompleto']} foi cadastrado no sistema!\n")
        elif confirmar == "2":
            print("\nOk, vamos preencher novamente o formulário.\n")
            continue
        elif confirmar == "3":
            print("\nVoltando ao menu principal...\n")
            break
        else:
            print("\nOpção inválida. Voltando ao menu principal...\n")
            break

        opcao = input("O que você deseja agora?"
                      "\n1 - Cadastrar um novo paciente"
                      "\n2 - Voltar ao menu principal"
                      "\n0 - Sair do sistema"
                      "\nDigite sua escolha: ")
        if opcao == "1":
            continue
        elif opcao == "2":
            break
        elif opcao == "0":
            print("\nSaindo do sistema... Até logo!")
            return
        else:
            print("\nOpção inválida! Voltando ao menu principal...")
            break

def cadastroDentista():
    while True:
        dentista = {}

        print("\nCadastro de Dentista Voluntário")
        dentista["nomeCompleto"] = input("Nome completo: ")
        dentista["cpf"] = input("CPF (somente números): ")
        dentista["numeroCro"] = input("Número do CRO: ")
        dentista["telefone"] = input("Telefone: ")
        dentista["email"] = input("E-mail: ")
        dentista["especialidade"] = input("Especialidade: ")

        print("\nAqui estão os dados que você forneceu:")
        for chave, valor in dentista.items():
            print(f"{chave}: {valor}")

        confirmar = input("\nTem certeza que deseja adicionar esse dentista ao sistema?"
                          "\n1 - Confirmar e adicionar"
                          "\n2 - Refazer formulário"
                          "\n3 - Cancelar e voltar ao menu principal"
                          "\nDigite sua escolha: ")
        if confirmar == "1":
            dentistas.append(dentista)
            print(f"\nMaravilha! O dentista {dentista['nomeCompleto']} foi cadastrado no sistema!\n")
        elif confirmar == "2":
            print("\nOk, vamos preencher novamente o formulário.\n")
            continue
        elif confirmar == "3":
            print("\nVoltando ao menu principal...\n")
            break
        else:
            print("\nOpção inválida. Voltando ao menu principal...\n")
            break

        opcao = input("O que você deseja agora?"
                      "\n1 - Cadastrar um novo dentista"
                      "\n2 - Voltar ao menu principal"
                      "\n0 - Sair do sistema"
                      "\nDigite sua escolha: ")
        if opcao == "1":
            continue
        elif opcao == "2":
            break
        elif opcao == "0":
            print("\nSaindo do sistema... Até logo!")
            return
        else:
            print("\nOpção inválida! Voltando ao menu principal...")
            break

while True:
    menuPrincipal = input(
        "\nInforme o que você deseja:"
        "\n1 - Ser um dentista voluntário"
        "\n2 - Ser um paciente da TdB"
        "\n3 - Exibir dentistas cadastrados (acesso restrito)"
        "\n4 - Exibir pacientes cadastrados (acesso restrito)"
        "\n0 - Sair do sistema"
        "\nDigite o número correspondente à sua escolha: "
    )

    if menuPrincipal == "1":
        cadastroDentista()

    elif menuPrincipal == "2":
        cadastroPaciente()

    elif menuPrincipal == "3":
        user = input("Digite o usuário: ")
        senha = input("Digite a senha: ")
        if user == USUARIO and senha == SENHA:
            if dentistas:
                print("\n--- Lista de Dentistas Cadastrados ---")
                for d in dentistas:
                    print(f"Nome: {d['nomeCompleto']} | CPF: {d['cpf']} | CRO: {d['numeroCro']}")
            else:
                print("\nNenhum dentista cadastrado ainda.")
        else:
            print("\nUsuário ou senha incorretos. Acesso negado.")

    elif menuPrincipal == "4":
        user = input("Digite o usuário: ")
        senha = input("Digite a senha: ")
        if user == USUARIO and senha == SENHA:
            if pacientes:
                print("\n--- Lista de Pacientes Cadastrados ---")
                for p in pacientes:
                    print(f"Nome: {p['nomeCompleto']} | CPF: {p['cpf']}")
            else:
                print("\nNenhum paciente cadastrado ainda.")
        else:
            print("\nUsuário ou senha incorretos. Acesso negado.")

    elif menuPrincipal == "0":
        print("\nSaindo do sistema... Até logo!")
        break

    else:
        print("\nOpção inválida. Tente novamente.")