# Zero Knowledge Proof Concept

Decription: prototyping/learning/testing ZKP

### TODO:
* [ ] descriptions (explain approach) & code comments
* [ ] rewrite concepts

### Concept#1:
Description:
```text
X: 3aa221ec7415da1b98d29edbe4fa4e097aeb45d8ada46ac377e12fcddc8424988283a190124db9bbad505444e8d95129ae8c2bb7c5665e23a6df9a413fe7a627809f3f65ac96ab7a3969fdd3a1b8f04fa28c42bd6a3f81662c65c673b1f6e2c5e16ede15e26583e8293f3eef8987ba50863e8beac4 
 V: 5e37035568aeac493178f7dd41a1a62cf113bd9d7861e94d0ea8f83825415dd4365bbea0c01dca5e4964365f1cdf5766c0a1af33849d49ccccbfdd8ebc8412add663f38b7fd5db6f3242b5be87cf4e7f855cc39755e17fd6d4ddb687ad611d99f0edf0d54a6232acd6fddd287faeaaf1940f311c8c0a9
Y: 1
T: 1
C: f6e0a1e2ac41945a9aa7ff8a8aaacebc12a3bcc981a929ad5cf81a9e11ae
R: -388b3f8ac85e2e658d86cf73a5c79342483a3063480b416cd495d448447dd0f2a8dc83aec9d0e98d1f490631a4116e81949c1f3ac7cfb76528aa09a1985721c0f653887f736813998472a5fe81988eb215a6cb2e0cf2f51e92942ad9acf468b6f760e55669b4ad6d46961c33bbd711ca9aebe47fa366b10d388f88258c5f48c292795af0527d8d928b54d03075128588dfd48f
T in verification: 1
EQ in verification: 1
Validity: true
```

### Concept#2
Description:
```text
Connecting to the server...
Your random p(mod) value: 1019
Your random g(generator) value: 198
Your secret: 1259751912179862346241205215297
Your random r value: 894
Sending P, g, X and Y to the verifier
Verifier sent c:0
Calculated Z as: 894
Sending Z to the verifier
Verified!
```

### Concept#3
Description: Deffie Hellman (1976)
```text
Defined: p=23(modulus) and g=5(base)

Alice picked random number (private key): 5
Alice's public key is: 20

Bob picked random number (private key): 7
Bob's public key is: 17

Alice and Bob exchange the public keys.

Alice computes the shared secret: 21
Bob computes the shared secret: 21

Alice and Bob can use shared secret: 21 to encrypt message!
```

### Concept#4
Description: RSA (sign)