from Fatec import Fatec  # Importando a classe Fatec do arquivo fatec.py

class ConsultaFatec:
    @staticmethod
    def main():
        # Criando instância de Fatec
        f = Fatec()
        f.Retorna_unidade("Baixada Santista")
        f.Retorna_curso("Análise e Desenvolvimento de Sistemas-Manhã")

# Executando a classe principal
if __name__ == "__main__":
    ConsultaFatec.main()


