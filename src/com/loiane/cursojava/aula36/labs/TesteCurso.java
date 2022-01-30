package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Curso curso = new Curso();
		System.out.println("Nome do Curso: ");
		String c = scan.nextLine();
		curso.setNomeCurso(c);
		
		System.out.println("Horario do curso: ");
		String h = scan.nextLine();
		curso.setHorario(h);
			
		Professor prof = new Professor();
		System.out.println("Nome do Professor do curso: ");
		String p = scan.nextLine();
		prof.setNomeProfessor(p);
		 	
		System.out.println("Nome do departamento do Professor: ");
		String d = scan.nextLine();
		prof.setDepartamento(d);
		
		System.out.println("Email do Professor do curso: ");
		String e = scan.nextLine();
		prof.setNomeProfessor(e);
		
		Aluno []alunos = new Aluno[2];
		
		for(int i = 0; i < alunos.length; i++) {
			
			scan.nextLine();
			
			System.out.println("Nome do Aluno "+ (i+1)+":");
			String a = scan.nextLine();
			
			System.out.println("Matricula do Aluno"+ (i+1)+":");
			String m = scan.nextLine();
		
			double [] notas = new double[4];
			
			for(int j = 0; j<4; j++) {
				System.out.println("\nNota "+(j+1)+" do aluno "+a);
				 notas[j] = scan.nextDouble();	
			}	
			Aluno aluno = new Aluno();
			aluno.setNomeAluno(a);
			aluno.setMatricula(m);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
		}
			curso.setAlunos(alunos);
			System.out.println(curso.obterInfo());			
		}			
	}