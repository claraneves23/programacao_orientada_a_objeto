from Automovel import Automovel

class Revendedora_1:
    @staticmethod
    def main():
        novo_automovel = Automovel()
        novo_automovel.mostrar_carro()

        novo_automovel_1 = Automovel(1997,"Volkwagen","Fusca",3888.00)
        novo_automovel_1.mostrar_carro()

if __name__ == "__main__":
    Revendedora_1.main()