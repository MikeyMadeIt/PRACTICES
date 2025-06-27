import requests
import html

url = "https://opentdb.com/api.php?amount=10"
response = requests.get(url)

if response.status_code == 200:
    data = response.json()

    questions = data["results"]

    for i, q in enumerate(questions, start=1):
        question = html.unescape(q["question"])
        correct = html.unescape(q["correct_answer"])
        print(f"\nQuestion {i}: {question}")
        print(f"Answer: {correct}")
else:
    print("Failed to fetch trivia questions.")