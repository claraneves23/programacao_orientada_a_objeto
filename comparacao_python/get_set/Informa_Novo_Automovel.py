from Novo_Automovel import novo_automovel

class Informa_Novo_Automovel:
    @staticmethod
    def main():
        novo_carro = novo_automovel()

        novo_carro.set_marca= input("Qual o marca do carro?\t")
        novo_carro.set_modelo= input("Qual o modelo do carro?\t")
        novo_carro.set_cor= input("Qual a cor do carro?\t")
        novo_carro.set_preco= float(input("Qual o preço do carro?\t"))

        print("\nDados do automóvel:\n")
        print(f"Marca:{novo_carro.marca}\t")
        print(f"Modelo:{novo_carro.modelo}\t")
        print(f"Cor:{novo_carro.cor}\t")
        print(f"Preco:{novo_carro.preco}\t")

if __name__ == "__main__":
    Informa_Novo_Automovel.main()