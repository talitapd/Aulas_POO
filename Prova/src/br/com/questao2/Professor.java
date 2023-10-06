package br.com.questao2;

    public class Professor extends Pessoa {
        private float salarioHora;
        private int horasAula;

        public Professor(String nome, String email, String senha, float salarioHora, int horasAula) {
            super(nome, email, senha);
            this.salarioHora = salarioHora;
            this.horasAula = horasAula;
        }

        public float getSalarioHora() {
            return salarioHora;
        }

        public void setSalarioHora(float salarioHora) {
            this.salarioHora = salarioHora;
        }

        public int getHorasAula() {
            return horasAula;
        }

        public void setHorasAula(int horasAula) {
            this.horasAula = horasAula;
        }

        public float calcularSalario() {
            return (float) (salarioHora * horasAula);
        }

        public String mostraProfessor() {
            return "Nome: " + getNome() +
                    "\nEmail: " + getEmail() +
                    "\nSalário: R$" + calcularSalario();
        }
    }

