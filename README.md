# Java Web Project — Review 1

## What this is
Minimal Java web project with:
- JDBC connectivity
- DAO layer
- Login servlet + JSPs
- SQL schema

## Setup
1. Install JDK 11+, Maven, Tomcat (or any servlet container).
2. Create the DB:
   - `mysql -u root -p < db/schema.sql`
   - Or run the SQL commands in `db/schema.sql`.
3. Edit `src/main/resources/db.properties` and set `jdbc.username` / `jdbc.password`.
4. Build:
   - `mvn clean package`
5. Deploy `target/java-web-project-review1.war` to Tomcat's `webapps/`.
6. Open `http://localhost:8080/java-web-project-review1/`

## Notes
- Sample user credentials in `db/schema.sql`: `student1 / password123`. In production, store hashed passwords.
- Add your project screenshots (e.g. `/mnt/data/825f0bfe-7d2b-4a4a-a488-93b1676fcfe4.png`) into the `docs/` or `presentation/` folder and reference them in the PPT.

