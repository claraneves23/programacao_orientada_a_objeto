from Livraria import Livraria

class Atendente_livraria:
    @staticmethod
    def main():
        
        livro = Livraria()

        print("Categorias:\n Digite 1 para romance\n Digite 2 para espírita\n Digite 3 para Informática\n Digite 4 para Terror\n")

        a = input("Categoria:")
        if int(a) < 0 or int(a)>4:
            print("Categoria inválida.")
            return 
        else:
            b = input("Autor:")
            c = input("Livro:")
            d = input("Código do livro:")
            if int(d)<0:
                print("Código inválido")
                return
            else:
                e = input("Quantidade:")
                if int(e)<0:
                    print("Quantidade inválida")
                    return
                else:
                    f = input("Preço:")
                    if float(f)<0:
                        print("Preço inválido")
                        return
                    else:

                        livro = Livraria(a,b,c,d,e,f)

                        livro.informa_livros(int(a))

if __name__ == "__main__":
     Atendente_livraria.main()

