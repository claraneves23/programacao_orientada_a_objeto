class Livraria:
    def __init__(self, editora="", autor="", livro="", id_livro="", quantidade=0, preco=0.0):
        self.editora = editora
        self.autor = autor
        self.livro = livro
        self.id_livro = id_livro
        self.quantidade = quantidade
        self.preco = preco

    def informa_livros(self, codigo):
        # Criando um dicionário para armazenar as categorias
        categorias = {
            1: "ROMANCE",
            2: "ESPÍRITA",
            3: "INFORMÁTICA",
            4: "TERROR"
        }

        # Verifica se o código existe no dicionário
        if codigo in categorias:
            mensagem = (
                f"CATEGORIA {categorias[codigo]}\n"
                f"CÓDIGO DO LIVRO: {codigo}{self.id_livro}\n"
                f"LIVRO: {self.livro}\n"
                f"EDITORA: {self.editora}\n"
                f"AUTOR: {self.autor}\n"
                f"QUANTIDADE: {self.quantidade}\n"
                f"PREÇO: R${float(self.preco):.2f}"
            )
            print(mensagem)  # Pode ser substituído por um messagebox em uma GUI
        else:
            print("Código não corresponde a nenhuma categoria de livro.")
