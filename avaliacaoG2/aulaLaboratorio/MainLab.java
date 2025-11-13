package aulaLaboratorio;

import java.util.*;

public class MainLab {
	
	//============ BLOCO A ============
	
    // Tarefa A1
	public static void tarefaA1() {
		System.out.println("TAREFA A1: COLLECTIONS BÁSICO");
		List<Integer> lista = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));
		
		// Sort
		Collections.sort(lista);
		System.out.println("Após sort: " + lista);
		
		// BinarySearch
		int pos = Collections.binarySearch(lista, 8);
		System.out.println("BinarySearch de 8: índice + " + pos);
		
		// Reverse
		Collections.reverse(lista);
		System.out.println("Após reverse: " + lista);
		
		// Shuffle
		Collections.shuffle(lista);
		System.out.println("Após shuffle: " + lista);
		System.out.println();
	}
	
	// Tarefa A2
	public static void tarefaA2() {
		System.out.println("TAREFA A2: COLLECTIONS AVANÇADO");
		List<String> l1 = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
		List<String> l2 = new ArrayList<>(Arrays.asList("C#", "Java", "Go"));
			
		// AdAll
		Collections.addAll(l1, "Kotlin", "Swift");
		System.out.println("L1 após adAll: " + l1);
			
		// Frequency
		int freq = Collections.frequency(l1,  "Java");
		System.out.println("Frequência de 'Java' em L1: " + freq);
			
		// Disjoint
		boolean disjunto = Collections.disjoint(l1, l2);
		System.out.println("L1 e L2 são disjuntos? " + disjunto);
			
		// Max & Min
		List<Integer> numeros = Arrays.asList(15, 3, 42, 89, 50);
		System.out.println("Lista numérica: " + numeros);
		System.out.println("Min: " + Collections.min(numeros));
		System.out.println("Max: " + Collections.max(numeros));
		System.out.println();
		
	}
		     
	//============ BLOCO B ============
		     
	// Tarefa B1
	public static void tarefaB1() {
		System.out.println("TAREFA B1: PARÊNTESES BALANCEADOS");
		String[] testes = {"((2+3)*(4-1))", ")(2+3)(", "(1+(2*3))"};
		
		// Chamada do método
		for (String expr : testes) {
			boolean balanceada = verificarParenteses(expr);
			System.out.println(expr + " -> " + (balanceada ? "Balanceada" : "Desbalanceada"));
		}
		 System.out.println();
	}
	
	// Método para verificar parênteses
	private static boolean verificarParenteses(String expr) {
		Stack<Character> pilha =  new Stack<>();
		for (char c : expr.toCharArray()) {
			if (c == '(') {
				pilha.push(c);
			} else if (c == ')') {
				if (pilha.isEmpty()) {
					return false;
			}
				pilha.pop();
			}
		}
		return pilha.isEmpty();
	}
		     
	// Tarefa B2
	public static void tarefaB2() {
		System.out.println("TAREFA B2: INVERTER PALAVRA COM STACK");
		String palavra = "ALGORITMO";
		String invertida = inverterPalavra(palavra);
		System.out.println(palavra + " -> " + invertida);
		System.out.println();
	}
	
	// Método para inverter a string
		private static String inverterPalavra(String palavra) {
		Stack<Character> pilha = new Stack<>();
		for (char c: palavra.toCharArray()) {
			pilha.push(c);
		}
		StringBuilder resultado = new StringBuilder();
		while(!pilha.isEmpty()) {
			resultado.append(pilha.pop());
        }
        return resultado.toString();
	}
	
	//============ BLOCO C ============
	
		// Tarefa C1
		public static void tarefaC1() {
			System.out.println("==== TAREFA C1: Fila de impressão ====");
			Queue<String> fila = new LinkedList<>();

			// Enfileirar Doc1, Doc2, Doc3
			fila.offer("Doc1");
			fila.offer("Doc2");
			fila.offer("Doc3");
			System.out.println("Após enfileirar Doc1, Doc2, Doc3: " + fila);

			// Remover dois
			fila.poll();
			System.out.println("Após remover um: " + fila);
			fila.poll();
			System.out.println("Após remover outro: " + fila);

			// Enfileirar Doc4
			fila.offer("Doc4");
			System.out.println("Após enfileirar Doc4: " + fila);
		
			System.out.println("Peek (próximo): " + fila.peek());
			System.out.println("Size: " + fila.size());
			System.out.println();
		}
	
		// Tarefa C2
		public static void tarefaC2() {
	        System.out.println("TAREFA C2: PriorityQueue");
	        PriorityQueue<Integer> pq = new PriorityQueue<>();

	        // Oferta: 30, 10, 20, 40
	        pq.offer(30);
	        pq.offer(10);
	        pq.offer(20);
	        pq.offer(40);

	        System.out.println("Peek (maior prioridade = menor valor): " + pq.peek());
	        System.out.println("Removendo todos em ordem de prioridade:");
	        while (!pq.isEmpty()) {
	            System.out.println("  Removido: " + pq.poll());
	        }
	        System.out.println();
	    }
	
		//============ BLOCO D ============
		
		// Tarefa D1
		public static void tarefaD1() {
	        System.out.println("==== TAREFA D1: Set (HashSet e TreeSet) ====");

	        // HashSet com duplicatas
	        HashSet<String> hashSet = new HashSet<>();
	        hashSet.add("Java");
	        hashSet.add("Python");
	        hashSet.add("C++");
	        hashSet.add("Java"); // duplicata
	        System.out.println("HashSet (sem duplicatas): " + hashSet);

	        // TreeSet ordenado
	        TreeSet<Integer> treeSet = new TreeSet<>();
	        treeSet.add(10);
	        treeSet.add(5);
	        treeSet.add(8);
	        treeSet.add(1);
	        System.out.println("TreeSet (ordenado): " + treeSet);
	        System.out.println("headSet(8): " + treeSet.headSet(8));
	        System.out.println("tailSet(8): " + treeSet.tailSet(8));
	        System.out.println();
	    }
		
		// Tarefa D2
		public static void tarefaD2() {
	        System.out.println("==== TAREFA D2: Map (HashMap e TreeMap) ====");

	        // HashMap com notas
	        Map<String, Integer> notas = new HashMap<>();
	        notas.put("Ana", 90);
	        notas.put("Carlos", 80);
	        notas.put("Bianca", 85);

	        System.out.println("Nota da Ana: " + notas.get("Ana"));
	        System.out.println("KeySet: " + notas.keySet());
	        System.out.println("Size: " + notas.size());

	        // TreeMap ordenado por chave
	        TreeMap<String, Integer> notasOrdenadas = new TreeMap<>(notas);
	        System.out.println("TreeMap (ordenado por chave): " + notasOrdenadas);
	        System.out.println();
	    }
		
		//============ BLOCO E ============
		
		// Tarefa E1
		public static void tarefaE1() {
	        System.out.println("TAREFA E1: Lista Encadeada");
	        ListaEncadeada lista = new ListaEncadeada();

	        lista.insertAtFront(3);
	        lista.insertAtFront(2);
	        lista.insertAtFront(1);
	        lista.insertAtBack(4);
	        lista.insertAtBack(5);

	        System.out.print("Lista após inserções: ");
	        lista.print();

	        lista.removeFromFront();
	        System.out.print("Após remover do início: ");
	        lista.print();

	        lista.removeFromBack();
	        System.out.print("Após remover do fim: ");
	        lista.print();
	        System.out.println();
	    }
		
		// Tarefa E2
		public static void tarefaE2() {
	        System.out.println("==== TAREFA E2: Árvore de Busca Binária ====");
	        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

	        int[] valores = {8, 3, 10, 1, 6, 14, 4, 7, 13};
	        for (int v : valores) {
	            arvore.inserir(v);
	        }

	        System.out.print("In-order: ");
	        arvore.inOrder();
	        System.out.println();

	        System.out.print("Pre-order: ");
	        arvore.preOrder();
	        System.out.println();

	        System.out.print("Post-order: ");
	        arvore.postOrder();
	        System.out.println();
	        System.out.println();
	    }

		//============ CLASSES AUXILIARES ============
		
		// Classe de lista encadeada simples
		static class NodoLista {
	        int data;
	        NodoLista next;

	        NodoLista(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

		// Lista Encadeada Simples
		static class ListaEncadeada {
	        private NodoLista primeiro;
	        private NodoLista ultimo;

	        public ListaEncadeada() {
	            this.primeiro = null;
	            this.ultimo = null;
	        }

	        public void insertAtFront(int valor) {
	            NodoLista novo = new NodoLista(valor);
	            novo.next = primeiro;
	            primeiro = novo;
	            if (ultimo == null) {
	                ultimo = novo;
	            }
	        }

	        public void insertAtBack(int valor) {
	            NodoLista novo = new NodoLista(valor);
	            if (primeiro == null) {
	                primeiro = ultimo = novo;
	            } else {
	                ultimo.next = novo;
	                ultimo = novo;
	            }
	        }

	        public int removeFromFront() {
	            if (primeiro == null) {
	                throw new NoSuchElementException("Lista vazia");
	            }
	            int valor = primeiro.data;
	            primeiro = primeiro.next;
	            if (primeiro == null) {
	                ultimo = null;
	            }
	            return valor;
	        }

	        public int removeFromBack() {
	            if (primeiro == null) {
	                throw new NoSuchElementException("Lista vazia");
	            }
	            if (primeiro == ultimo) {
	                int valor = primeiro.data;
	                primeiro = ultimo = null;
	                return valor;
	            }
	            NodoLista atual = primeiro;
	            while (atual.next != ultimo) {
	                atual = atual.next;
	            }
	            int valor = ultimo.data;
	            atual.next = null;
	            ultimo = atual;
	            return valor;
	        }

	        public void print() {
	            if (primeiro == null) {
	                System.out.println("Lista vazia");
	                return;
	            }
	            NodoLista atual = primeiro;
	            while (atual != null) {
	                System.out.print(atual.data);
	                if (atual.next != null) {
	                    System.out.print(" -> ");
	                }
	                atual = atual.next;
	            }
	            System.out.println();
	        }
	    }
		
		// Classe de nó para Árvore Binária
		static class NodoArvore {
	        int data;
	        NodoArvore esquerda;
	        NodoArvore direita;

	        NodoArvore(int data) {
	            this.data = data;
	            this.esquerda = null;
	            this.direita = null;
	        }
	    }
		
		// Árvore binária de busca
		static class ArvoreBinariaBusca {
	        private NodoArvore raiz;

	        public ArvoreBinariaBusca() {
	            this.raiz = null;
	        }

	        public void inserir(int valor) {
	            raiz = inserirRecursivo(raiz, valor);
	        }

	        private NodoArvore inserirRecursivo(NodoArvore atual, int valor) {
	            if (atual == null) {
	                return new NodoArvore(valor);
	            }
	            if (valor < atual.data) {
	                atual.esquerda = inserirRecursivo(atual.esquerda, valor);
	            } else if (valor > atual.data) {
	                atual.direita = inserirRecursivo(atual.direita, valor);
	            }
	            return atual;
	        }

	        public void inOrder() {
	            inOrderRecursivo(raiz);
	        }

	        private void inOrderRecursivo(NodoArvore nodo) {
	            if (nodo != null) {
	                inOrderRecursivo(nodo.esquerda);
	                System.out.print(nodo.data + " ");
	                inOrderRecursivo(nodo.direita);
	            }
	        }

	        public void preOrder() {
	            preOrderRecursivo(raiz);
	        }

	        private void preOrderRecursivo(NodoArvore nodo) {
	            if (nodo != null) {
	                System.out.print(nodo.data + " ");
	                preOrderRecursivo(nodo.esquerda);
	                preOrderRecursivo(nodo.direita);
	            }
	        }

	        public void postOrder() {
	            postOrderRecursivo(raiz);
	        }

	        private void postOrderRecursivo(NodoArvore nodo) {
	            if (nodo != null) {
	                postOrderRecursivo(nodo.esquerda);
	                postOrderRecursivo(nodo.direita);
	                System.out.print(nodo.data + " ");
	            }
	        }
	    }
		
		//============ MAIN ============
		public static void main(String[] args) {
	        System.out.println("========================================");
	        System.out.println("ATIVIDADE DE LABORATÓRIO - COMPLETA");
	        System.out.println("========================================\n");

	        // Bloco A
	        tarefaA1();
	        tarefaA2();

	        // Bloco B
	        tarefaB1();
	        tarefaB2();

	        // Bloco C
	        tarefaC1();
	        tarefaC2();

	        // Bloco D
	        tarefaD1();
	        tarefaD2();

	        // Bloco E
	        tarefaE1();
	        tarefaE2();

	        System.out.println("ATIVIDADE CONCLUÍDA!");
	    }
	}
		
		

