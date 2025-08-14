# AI Supported Data Architecture Design Session Assistant (AISADSA)

AISADSA is an innovative, AI-powered decision support system that makes **data architecture design** more accessible, interactive, and effective.  
It guides users through a dynamic question flow to identify architecture requirements and provides **customized solutions** supported by clear visuals and diagrams.  
The system enhances architectural decision-making by automating the design workflow and delivering intelligent, context-aware guidance throughout the session.

## Features
- **Dynamic Question Flow** – Adapts in real-time based on the user’s answers, ensuring each design session is tailored to the specific needs, constraints, and goals of the project. This prevents irrelevant questions and accelerates the decision-making process.
- **Business Rule Engine (Drools)** – Analyzes responses and assigns scores to various architectural options, producing transparent and measurable recommendations. It also generates additional informative suggestions when a simple score is insufficient.
- **Large Language Model Integration** – Leverages Spring AI with the OpenAI API to provide contextual, interactive guidance. The LLM remembers previous answers during a session, enabling it to clarify concepts, ask relevant follow-up questions, and offer targeted advice.
- **AI-Assisted Diagram Generation** – The system employs a **carefully designed set of structured prompts** that instruct the LLM on diagram structure, components, and standards, ensuring the output is meaningful, accurate, and visually clear. These prompts dynamically adapt to user responses, preventing the generation of irrelevant or nonsensical diagrams and producing professional, context-aware visualizations with MermaidJS.
- **User-Friendly Interface** – Built with React and React Bootstrap to provide a responsive, intuitive, and accessible interface, enabling smooth interaction on different devices.

## Technologies
- **Backend:** Java, Spring Boot, MySQL, JWT
- **Business Logic:** Drools Rule Engine
- **AI Integration:** Spring AI, OpenAI API (GPT-4o mini)
- **Frontend:** React, React Bootstrap
- **Diagramming:** MermaidJS

## Key Benefits
- Enables users, even with limited technical knowledge, to make accurate data architecture decisions.
- Speeds up the design process and reduces errors.
- Adaptable for organizations of any size or sector.
- Combines **decision-making, learning, and visualization** into one platform.

>[!Note]
> For the frontend implementation of AISADSA, please visit the [frontend repository](https://github.com/MCA01/aisadsa-ui).

 
