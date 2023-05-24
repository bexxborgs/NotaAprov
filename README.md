# Sistema de Verificação de Notas 

Sistema de Verificação de Notas é um programa em Java que permite aos usuários digitar suas notas em quatro avaliações e, em seguida, exibe uma mensagem correspondente ao seu desempenho acadêmico.

A classe principal do projeto, chamada "NotaAprov", contém um método main onde é solicitado ao usuário que digite suas quatro notas. Em seguida, o programa calcula a média das notas e chama o método "getNota" para obter uma string correspondente ao resultado.

O método "getNota" recebe a média como parâmetro e realiza uma verificação para determinar o desempenho acadêmico do aluno. Se a média estiver entre 0 e 4, é retornada a mensagem "Você está reprovado". Se a média estiver entre 5 e 7, é retornada a mensagem "Você está de recuperação". Se a média estiver entre 7 e 10, é retornada a mensagem "Você está aprovado !!!". Caso a média seja inválida (fora do intervalo de 0 a 10), é retornada a mensagem "Nota inválida. Digite um valor entre 0 e 10".

O Sistema de Verificação de Notas é uma ferramenta simples, porém útil, que pode ser utilizada por estudantes e professores para verificar o desempenho acadêmico com base nas notas obtidas.
