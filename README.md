# ActBasicComposable

Tugas Praktikum PAM — pengenalan Basic Composable dengan Jetpack Compose.

Aplikasi menampilkan layout dasar Compose seperti `Column`, `Text`, dan `Scaffold` (lihat `Tugas.kt`, `MainActivity.kt`).

## Fitur

- `Greeting()` di `MainActivity.kt` — contoh Text + Preview
- `TataletakColumn()` di `Tugas.kt` — susunan 4 komponen Text dalam Column dengan padding 16.dp
- Material3 + `ActBasicComposableTheme`

## Struktur Proyek

```
app/src/main/java/com/mamay/actbasiccomposable/
├── MainActivity.kt   # Entry point + Greeting
├── Tugas.kt          # TataletakColumn
├── TataLetak.kt
└── ui/theme/         # Color.kt, Theme.kt, Type.kt
```

## Cara Menjalankan

1. Buka proyek ini di Android Studio
2. Sync Gradle
3. Run di emulator / HP via USB

## Screenshot

> Taruh file screenshot kamu di `app/src/main/res/drawable/`,
> lalu ubah nama file di bawah sesuai nama file aslinya.

| Tampilan Utama | Tata Letak Column |
|---|---|
| ![Screenshot 1](app/src/main/res/drawable/screenshot_1.png) | ![Screenshot 2](app/src/main/res/drawable/screenshot_2.png) |

Contoh jika file kamu bernama `hasil1.jpg`:
```markdown
![Hasil 1](app/src/main/res/drawable/hasil1.jpg)
```

## Teknologi

- Kotlin
- Jetpack Compose (Material3)
- Android Studio
