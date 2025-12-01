# 🍕 Mozza – Android Menu App

Mozza is a simple and elegant Android application that showcases a restaurant-style menu with detailed dish pages, a splash screen, and a login view.  
Built using **Android Studio**, **XML layouts**, and **Java**, this project demonstrates clean UI design, multiple activities, and structured navigation.

---

## 📱 Features

### 🍽️ Menu Interface
- Scrollable menu UI (`mainpage.xml`)
- Each dish displayed with image, description, and price
- Card-style layout with elevation and modern look

### 🧭 Navigation
- Dedicated activity for each dish:
  - `MargheritaActivity.java`
  - `CarbonaraActivity.java`
  - `TiramisuActivity.java`
- `LoginActivity.java` for basic login screen
- `SplashActivity.java` for app introduction

### 🎨 Design
- Clean XML layouts for all activities  
- Custom theme (`Theme.kt`, `Color.kt`, `Type.kt`)  
- Drawable menu images for each dish  
- Adaptive launcher icons (mipmap folders)

---

## 🗂️ Project Structure

Mozza/
├── app/
│ ├── build.gradle.kts
│ └── src/
│ ├── main/
│ │ ├── AndroidManifest.xml
│ │ ├── java/com/example/mozza/
│ │ │ ├── MainActivity.java
│ │ │ ├── LoginActivity.java
│ │ │ ├── SplashActivity.java
│ │ │ ├── MargheritaActivity.java
│ │ │ ├── CarbonaraActivity.java
│ │ │ ├── TiramisuActivity.java
│ │ │ └── ui/theme/
│ │ │ ├── Color.kt
│ │ │ ├── Theme.kt
│ │ │ └── Type.kt
│ │ ├── res/
│ │ │ ├── layout/ (all XML screen layouts)
│ │ │ ├── drawable/ (menu images, logos)
│ │ │ ├── mipmap-*dpi/ (adaptive icons)
│ │ │ └── values/ (colors, themes, strings)
│ └── test/ + androidTest/
├── build.gradle.kts
├── settings.gradle.kts
└── gradlew / gradlew.bat


---

## 🚀 How to Run the App

### 1️⃣ Clone the repository
```bash
git clone https://github.com/<your-username>/Mozza.git
cd Mozza
