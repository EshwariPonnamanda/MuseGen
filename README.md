# 🎨 MuseGen: AI Inspiration Generator

**MuseGen** is a lightweight command-line Java application that fetches **random poems** from the free and open [PoetryDB API](https://poetrydb.org) and displays them elegantly in your terminal.

> No OpenAI key or paid services required. Just Java, a JSON parser, and inspiration. ✨

---

## 🌟 Features

- 📜 Fetches a **random poem** every time you run it.
- ✍️ Displays **title**, **author**, and **poem content** in a clean format.
- 🌐 Uses [PoetryDB](https://poetrydb.org) — a free public API for poems.
- 🧰 Built in Java using `org.json` for easy JSON parsing.
- 🖥️ Simple, portable command-line interface.

---

## 🛠️ Setup & Running

Follow these steps to get **MuseGen** running on your local machine:

### 1. Clone the Repository

```bash
git clone https://github.com/EshwariPonnamanda/MuseGen.git
cd MuseGen

2.Download the JSON Library
	•	Download json-20230227.jar
	•	Place it in the root of your MuseGen project folder.

3.Compile the Java Program
javac -cp .:json-20230227.jar MuseGen.java
java -cp .:json-20230227.jar MuseGen

Note: Use ; instead of : on Windows.



🤝 Contributing
Want to expand MuseGen with features like:
	•	🧠 Quotes, Lyrics, and Ideas
	•	🎵 AI-generated suggestions
	•	🌐 Fetch by mood or keyword
	•	🌈 Beautiful GUI in JavaFX or Web UI

Feel free to fork the project, open issues, or submit pull requests. All contributions are welcome!

📄 License
MIT License © 2025 @EshwariPonnamanda

💫 Inspiration
This project is inspired by the idea of creative prompts for artists, writers, and poets who want instant inspiration on the go.

"MuseGen" is your AI-friendly muse, one poem at a time.