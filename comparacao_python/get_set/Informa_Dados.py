from Dados_Contribuinte import Dados_Contribuinte

class Informa_Dados:
    @staticmethod
    def main():
        dado = Dados_Contribuinte()

        dado.set_nome=input("Qual o nome do contribuinte?\t")
        dado.set_cpf=input("Qual o cpf do contribuinte?\t")
        dado.set_cnpj=input("Qual o cnpj do contribuinte?\t")
        dado.set_cartao=input("Qual o número do cartão do contribuinte?\t")

        print("\nDados do contribuinte:\n")

        print(f"Nome:{dado.nome}\t")
        print(f"CPF:{dado.cpf}\t")
        print(f"CNPJ:{dado.cnpj}\t")
        print(f"Cartão:{dado.cartao}\t")

if __name__ == "__main__":
    Informa_Dados.main()
    