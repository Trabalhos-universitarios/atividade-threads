# atividade-threads

Descrição da Atividade:
Esta atividade tem como objetivo a utilização e demonstração da concorrência utilizando threads. 
•	Imagine que queremos desenvolver um cofre para guardar dinheiro de forma segura. Precisamos testar quanto tempo levaria para hackers abrirem esse cofre descobrindo a senha.
•	Teremos algumas threads de hackers tentando descobrir a senha na “força bruta” de forma concorrente.
•	Teremos uma thread policial que irá ao nosso “socorro” na contagem de 10 segundos. Caso os hackers não tenham aberto o cofre nesse período, o policial irá prende-los. 
•	O policial deverá mostrar o seu progresso de chegada enquanto a contagem acontece. Ou seja, a contagem do tempo restante que os hackers ainda tem para abrir o cofre deverá ser mostrada.


![image](https://github.com/Trabalhos-universitarios/atividade-threads/assets/66291657/fcf7a3db-0c12-4454-b688-36370c656209)

## Roteiro da Atividade:
1.	A senha deverá ser numérica e determinada de forma randômica ao executar o programa. Uma sugestão é que tenha o número de dígitos fixo e um valor max (99999 por exemplo). 
2.	Crie a classe Cofre – aqui temos o atributo privado senha e o método que retorna, dado a senha “chutada”, se a tentativa de abertura por senha está correta ou não.
3.	Crie as classes de hackers (sugestão: estenda a classe Thread como visto em aula). Aqui seu hacker pode tentar chegar na senha de diversas formas, pode ser da forma mais simples como um contador crescente e um decrescente, por exemplo. Precisamos de no mínimo 2 threads de hackers.
4.	Caso o hacker tenha descoberto a senha, encerre o programa e diga qual thread que conseguiu abrir o cofre.
5.	Crie a thread da polícia.  Essa thread deve rodar por no máximo 10 segundos, caso tenha atingido 10 segundos e nenhum hacker já tenha aberto o cofre, imprima uma mensagem de que a polícia pegou os hackers e eles estão presos.
Atividade teórica:
6.	Faça uma pesquisa sobre como e por qual motivo utilizar mutex e semáforo no contexto de programação concorrente.

