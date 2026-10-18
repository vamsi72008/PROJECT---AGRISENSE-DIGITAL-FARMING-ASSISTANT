# AgriSense: Digital Farming Assistant

**AgriSense** is a comprehensive, Java-based console application developed to support farmers, agricultural officers, and administrators in managing farming ecosystems efficiently. By digitizing core agricultural activities—from farm registration and crop monitoring to irrigation scheduling and sales analytics—the application reduces manual record-keeping and promotes sustainable, data-driven farming practices.

## 🛠️ Technical Architecture & Concepts Used
The application is engineered completely from scratch using core **Object-Oriented Programming (OOP)** and modern Java architectures:
* **Encapsulation & Data Modeling:** Clean class definitions leveraging private fields with standard getter/setter interfaces.
* **Java Collections Framework:** Dynamic storage management using structures like `List`, `ArrayList`, and `Map` to index real-time records.
* **Stream API & Lambda Expressions:** Advanced data processing implementations used to compute real-time analytical summaries and compute yields.
* **Robust File Handling & Exceptions:** Integrated safe data persistence layers to preserve logs across application sessions alongside predictive input validations.

---

## 📂 Core Application Modules

### 1. 🧑‍🌾 Farmer Profile Module
Manages unique profiles, tracking `farmerId`, contact configurations, agricultural experience metrics, and collective land acreage dimensions across villages and districts.

### 2. 🌱 Crop & Farm Management Modules
Tracks structural field allocations, tracking details like soil types, cultivation areas, active crop varieties, target sowing/harvest timeframes, and growth statuses (`Sown`, `Growing`, `Harvest Ready`).

### 3. 💧 Irrigation & Resource Planner
Controls resource utilization data by logging targeted irrigation types (`Drip`, `Sprinkler`, `Flood`), precision watering volumes, and scheduled chemical/organic applications.

### 4. 📈 Harvest, Sales & Service Layers
* **Harvest & Sales:** Processes revenue equations against dynamic market buyers and automatically formats client invoice transactions.
* **Validate & Search Services:** Implements instant string pattern verifications (Email, Mobile layout constraints) and filters active collection models instantly.
* **Analysis & Report Systems:** Leverages functional Stream flows to isolate highest-producing fields, measure water over-consumption, and construct printable overview summaries.

---

## 💻 System Execution Blueprint
The execution context flows entirely through a modular, menu-driven interface coordinated inside a unified entry point (`Main.java`):

```text
  [ AgriSense System Menu ]
  ├── 1. Register / Manage Farmer Profile
  ├── 2. Map Farmlands & Analyze Soil Types
  ├── 3. Track Sowing Schedules & Crop Growth
  ├── 4. Log Smart Irrigation & Water Volumes
  ├── 5. Record Harvesting Yields & Generate Invoices
  ├── 6. Run Statistical Streams (Highest Yield, Total Revenue)
  └── 7. Safe Save & Terminate Application
```

## 🚀 How to Run the Project
1. Clone this repository onto your local desktop environment.
2. Launch **Eclipse IDE** and select `File` ➔ `Import...` ➔ `Existing Projects into Workspace`.
3. Locate the imported codebase, navigate to the `Main.java` file within your package, right-click, and select **Run As ➔ Java Application**.
