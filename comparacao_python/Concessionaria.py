from Automovel import Automovel

class Concessionaria:
    @staticmethod
    def main():
            
        print("Executando...")
        carro = Automovel()

            
        mr = input("digite a marca:")
        md = input("digite o modelo:")
        cr = input("digite a cor:")
        pr = input("digite o preço:")

        carro= Automovel(mr,md,cr,pr)

        carro.Informa_automovel()

if __name__ == "__main__":
    Concessionaria.main()