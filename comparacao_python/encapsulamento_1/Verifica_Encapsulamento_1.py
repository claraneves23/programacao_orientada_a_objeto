from encapsulamento_1.Acesso_Numeros import Acesso_Numeros


class Verifica_Encapsulamento_1:
    @staticmethod
    def main():
        chave = Acesso_Numeros()

        chave.a = 10
        chave.b = 20
        #chave.c = 30; NÃO É POSSÍVEL ACESSAR VARIÁVEL PRIVATE
        chave.setNumero("c",30)
        chave.d = 40
        chave.mostra_numero()

if __name__ == "__main__":
     Verifica_Encapsulamento_1.main()