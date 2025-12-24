# Throwable no Java — Resumo Didático

## 1. Throwable
Classe raiz de tudo que pode ser lançado com `throw`.
Todo erro ou exceção no Java herda de `Throwable`.

Estrutura:

      Throwable
        ├── Error
        └── Exception
              └── RuntimeException

---

## 2. Error
- Erros graves da JVM
- Não causados por erro de lógica
- Não devem ser tratados pelo programador

Exemplos:
- OutOfMemoryError
- StackOverflowError

Resumo:
> Indica falha crítica da JVM. O programa não pode continuar.

---

## 3. Exception
- Problemas que podem ocorrer durante a execução
- Podem ser tratados pelo programador

Divide-se em:
- Checked Exceptions
- RuntimeException (Unchecked)

---

## 4. Checked Exceptions
- Tratamento obrigatório
- O compilador exige `try-catch` ou `throws`
- Precisa fazer uma validação para que seu código possa rodar

Exemplos:
- IOException
- SQLException
- ClassNotFoundException

---

## 5. RuntimeException(Unchecked)
- Tratamento não obrigatório
- Geralmente erro de lógica do programador
- São aquelas que ocorrem quando o código roda

Exemplos:
- NullPointerException
- ArithmeticException
- ArrayIndexOutOfBoundsException

---

## 6. Regra de Ouro
- Error → não trate
- Exception (checked) → trate ou propague
- RuntimeException → corrija o código
