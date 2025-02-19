from Livraria import Livraria

class Atendente_livraria:
    @staticmethod
    def main():
        
        livro = Livraria()

        print("Categorias:\n Digite 1 para romance\n Digite 2 para espírita\n Digite 3 para Informática\n Digite 4 para Terror\n")

        a = input("Categoria:")
        while int(a) < 0 or int(a)>4:
            if int(a) < 0 or int(a)>4:
                print("Categoria inválida.")
                a = input("Categoria:")
            
        b = input("Autor:")
        c = input("Livro:")
        d = input("Código do livro:")
        while int(d)<0:
            if int(d)<0:
                print("Código inválido")
                d = input("Código do livro:")
            
        e = input("Quantidade:")
        while int(e)<0:
            if int(e)<0:
                 print("Quantidade inválida")
                 e = input("Quantidade:")
                       
        f = input("Preço:")
        while int(f)<0:
            if float(f)<0:
                    print("Preço inválido")
                    f = input("Preço:")
                           
        livro = Livraria(a,b,c,d,e,f)

        livro.informa_livros(int(a))

if __name__ == "__main__":
     Atendente_livraria.main()

