# 🚀 MyArrayList em Java (Explicação Completa)

> Este projeto implementa uma lista sequencial usando array **do zero**, com foco total em lógica de estruturas de dados.

---

# 🧠 Ideia Principal

A classe `MyArrayList` simula um `ArrayList`, mas sem usar nada pronto.

Você controla tudo manualmente:

* Onde inserir
* Como remover
* Como deslocar elementos

---

# 🧱 Estrutura Base

```java
private int[] items;
private int size;
```

### 🔹 items

Array que guarda os valores.

### 🔹 size

Quantidade de elementos válidos.

💡 IMPORTANTE:

* `items.length` = capacidade
* `size` = quantos estão sendo usados

---

# ⚙️ CONSTRUTOR

```java
public MyArrayList(int capacity) {
    items = new int[capacity];
    size = 0;
}
```

### 🧠 O que acontece:

* Cria o array com tamanho fixo
* Começa vazio (`size = 0`)

---

# ➕ INSERÇÃO

## 🔹 addFirst

```java
for (int i = size; i > 0; i--) {
    items[i] = items[i - 1];
}
items[0] = value;
size++;
```

### 💡 Lógica:

1. Empurra tudo pra direita
2. Coloca no início
3. Aumenta size

### 🔍 Exemplo:

Antes:

```
[10, 20, 30, 0, 0]
```

Depois:

```
[5, 10, 20, 30, 0]
```

---

## 🔹 addLast

```java
items[size] = value;
size++;
```

### 💡 Lógica:

* Insere no final direto

---

## 🔹 insertAt

```java
if (index < 0 || index > size) return;

for (int i = size; i > index; i--) {
    items[i] = items[i - 1];
}

items[index] = value;
size++;
```

### 💡 Lógica:

* Abre espaço no meio
* Insere no índice

---

# ❌ REMOÇÃO

## 🔹 removeFirst

```java
int removed = items[0];

for (int i = 0; i < size - 1; i++) {
    items[i] = items[i + 1];
}

size--;
return removed;
```

### 💡 Lógica:

* Remove o primeiro
* Puxa tudo pra esquerda

---

## 🔹 removeLast

```java
int removed = items[size - 1];
size--;
return removed;
```

### 💡 Lógica:

* Só diminui o size

---

## 🔹 removeAt

```java
int removed = items[index];

for (int i = index; i < size - 1; i++) {
    items[i] = items[i + 1];
}

size--;
return removed;
```

### 💡 Lógica:

* Remove no meio
* Fecha o espaço

---

## 🔹 remove(valor)

```java
int index = find(value);

if (index == -1) return false;

removeAt(index);
return true;
```

### 💡 Lógica:

* Busca o valor
* Remove pela posição

---

# 🔍 BUSCA

## 🔹 find

```java
for (int i = 0; i < size; i++) {
    if (items[i] == value) return i;
}
return -1;
```

### 💡 Lógica:

* Percorre tudo
* Retorna índice

---

## 🔹 get

```java
return items[index];
```

### 💡 Lógica:

* Acesso direto

---

# 🔄 ATUALIZAÇÃO

## 🔹 set

```java
items[index] = value;
```

### 💡 Lógica:

* Substitui valor

---

# 🧠 CONCEITO MAIS IMPORTANTE

## 🔥 SHIFT (DESLOCAMENTO)

### 👉 Direita (inserção)

```java
for (int i = size; i > index; i--)
```

### 👉 Esquerda (remoção)

```java
for (int i = index; i < size - 1; i++)
```

---

# ⚠️ ERROS COMUNS

* ❌ Esquecer `size++`
* ❌ Esquecer `size--`
* ❌ Loop na direção errada
* ❌ Usar `items.length` em vez de `size`

---

# 🧪 EXEMPLO FINAL

```
[10, 20, 30]

insertAt(1, 99)

[10, 99, 20, 30]
```

---

# 💥 RESUMO FINAL

* Inserir = shift direita
* Remover = shift esquerda
* size controla tudo

---

# 🎯 OBJETIVO DO PROJETO

Se você entendeu isso, você entendeu:

✔ Como ArrayList funciona por dentro
✔ Estruturas de dados básicas
✔ Manipulação de memória

🔥 Isso aqui é base pra prova e pra programação de verdade.
