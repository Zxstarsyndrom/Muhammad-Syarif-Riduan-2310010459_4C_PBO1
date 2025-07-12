# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `PeternakanAyam`, `JenisAyam`, dan `PeternakanAyamBanjarmasin` adalah contoh dari class.

```bash
public class PeternakanAyam {
    ...
}

public class JenisAyam extends PeternakanAyam {
    ...
}

public class PeternakanAyamBanjarmasin {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `ayamArray[i] = new JenisAyam(jenis, kelamin, umur);` adalah contoh pembuatan object.

```bash
ayamArray[i] = new JenisAyam(jenis, kelamin, umur);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `Ras`, `JenisKelamin` dan `Umur` adalah contoh atribut.

```bash
String Ras, JenisKelamin;
int umur;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `PeternakanAyam` dan `JenisAyam`.

```bash
public PeternakanAyam(String Ras, String JenisKelamin, int umur) {
        this.Ras = Ras;
        this.JenisKelamin = JenisKelamin;
        this.umur = umur;
    }
public JenisAyam(String Ras, String JenisKelamin, int umur) {
        super(Ras, JenisKelamin, umur);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setRas`,`setJenisKelamin` dan `setUmur` adalah contoh method mutator.

```bash
 public void setRas(String Ras) {
        this.Ras = Ras;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getJenisKelamin` dan `getUmur` adalah contoh method accessor.

```bash
public String getRas() {
        return Ras;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public int getUmur() {
        return umur;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `Ras`,`JenisKelamindan` `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
 private String Ras, JenisKelamin;
 private int umur;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `JenisAyam` mewarisi `PeternakanAyam` dengan sintaks `extends`.

```bash
public class JenisAyam extends PeternakanAyam {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `infoAyam()` di `InfoAyam` ` merupakan override dari method `infoayam()` di `PeternakanAyam`.

```bash
@Override
    public void infoAyam() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `InfoAyam`.

```bash
public String getFakultas() {
    if(getNpm().substring(2, 4).equals("10")){
        return "Teknologi Informasi";
    } else {
        return "Fakultas lain";
    }

    //return getNpm().substring(2, 4).equals("10") ? "Teknologi Informasi" : "Fakultas lain";
}

public String getProdi() {
    switch(getNpm().substring(4, 6)) {
        case "01":
            return "Teknik Informatika";
        case "02":
            return "Sistem Informasi";
        default:
            return "Prodi lain";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < ayamArray.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Jenis Ayam (Petelur/Pedaging): ");
            String jenis = scanner.nextLine().trim();

System.out.println("Ayam ke-" + (i + 1));
            ayamArray[i].infoAyam();```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `JenisAyam[] ayamArray = new JenisAyam[2];;` adalah contoh penggunaan array.

```bash
JenisAyam[] ayamArray = new JenisAyam[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `catch` untuk menangani error.

```bash
catch (InputMismatchException e) {
                    System.out.println("Input tidak valid! Silakan masukkan angka untuk umur.");
                    scanner.nextLine();
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Syarif Riduan
NPM: 2310010459
