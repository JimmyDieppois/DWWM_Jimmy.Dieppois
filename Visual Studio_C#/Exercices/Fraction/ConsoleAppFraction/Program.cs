﻿using System;
using ClassLibraryFraction;

namespace ConsoleAppFraction
{
    class Program
    {
        static void Main(string[] args)
        {
            String answer;
            Fraction f1 = new Fraction(60, 4);
            Fraction f2 = new Fraction(80, 5);
            Fraction f3 = new Fraction(9);

            // Donner une représentation textuel de toutes ses informations
            Console.Write("Voulez-vous afficher les fractions ? O/N : ");
            answer = Console.ReadLine();
            if (answer.ToLower().Equals("o"))
            {
                Console.WriteLine(f1);
                Console.WriteLine(f3);
                Console.WriteLine(f2);
            } 

            // Ecrire une méthode publique Oppose()
            Console.Write("Voulez-vous inverser le signe de la fraction ? O/N : ");
            answer = Console.ReadLine();
            if (answer.ToLower().Equals("o"))
            {
                f1.Oppose();
                Console.WriteLine(f1);
            }

            // Ecrire une méthode publique Inverse()
            Console.Write("Voulez-vous inverser le numérateur avec le dénominateur ? O/N : ");
            answer = Console.ReadLine();
            if (answer.ToLower().Equals("o"))
            {
                f1.Inverse();
                Console.WriteLine(f1);
            }

            // Ecrire une méthode publique SuperieurA de Fraction qui permet de savoir si une Fraction est supérieur à une autre Fraction.
            Console.Write("Voulez-vous savoir si une fraction est supérieur a une autre ? O/N : ");
            answer = Console.ReadLine();
            if (answer.ToLower().Equals("o"))
            {
                Console.WriteLine(f1.SuperieurA(f2));
            } 
            
            // Ecrire une méthode publique EgalA de Fraction qui permet de savoir si une: Fraction est égal à une autre :Fraction.
            Console.Write("Voulez-vous savoir si une fraction est égal a une autre ? O/N : ");
            answer = Console.ReadLine();
            if (answer.ToLower().Equals("o"))
            {
                Console.WriteLine(f1.EgalA(f2));
            }

            // La méthode privée Reduire() réduit la fraction courante en divisant numérateur et dénominateur par leur pgcd ettraite le problème du signe de la fraction,
            // le signe de lafraction est le signe de son numérateur, si le numérateur et le dénominateur sont négatifs, la fraction n'a pas de signe(implicitement +).
            Console.Write("Voulez-vous simplifier une fraction ? O/N : ");
            answer = Console.ReadLine();
            if (answer.ToLower().Equals("o"))
            {
                Console.WriteLine(f1);
                f1.Reduire();
                Console.WriteLine(f1);
            }

            // Ecrire une méthode publique Plus de Fraction qui permet d’additionner une :Fraction avec une autre :Fraction.
            Console.Write("Voulez-vous additioner deux fractions ? O/N : ");
            answer = Console.ReadLine();
            if (answer.ToLower().Equals("o"))
            {
                Console.Write(f1 + " + " + f2 + " = ");
                Console.WriteLine(f1.Plus(f2).ToString());
            }

            //Ecrire une méthode publique Moins de Fraction qui permet de soustraire une :Fraction avec une autre :Fraction.
            Console.Write("Voulez-vous soustraire deux fractions ? O/N : ");
            answer = Console.ReadLine();
            if (answer.ToLower().Equals("o"))
            {
                Console.Write(f1 + " - " + f2 + " = ");
                Console.WriteLine(f1.Moins(f2).ToString());
            } 
            
            //Ecrire une méthode publique Multiplie de Fraction qui permet de soustraire une :Fraction avec une autre :Fraction.
            Console.Write("Voulez-vous multiplier deux fractions ? O/N : ");
            answer = Console.ReadLine();
            if (answer.ToLower().Equals("o"))
            {
                Console.Write(f1 + " - " + f2 + " = ");
                Console.WriteLine(f1.Multiplie(f2).ToString());
            } 
            
            //Ecrire une méthode publique Divise de Fraction qui permet de soustraire une :Fraction avec une autre :Fraction.
            Console.Write("Voulez-vous diviser deux fractions ? O/N : ");
            answer = Console.ReadLine();
            if (answer.ToLower().Equals("o"))
            {
                Console.Write(f1 + " - " + f2 + " = ");
                Console.WriteLine(f1.Divise(f2).ToString());
            }








            Console.WriteLine("\n-------------------------------------------------------------------------------\n\n" +
                "Appuyez sur une touche pour quitter le programme !");
            Console.ReadLine();
        }
    }
}
