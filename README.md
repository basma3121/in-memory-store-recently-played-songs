  <h1>Recently Played Songs Playlist</h1>
   <h2>Overview</h2>
    <p>Create an in-memory store for recently played songs that can accommodate N songs per user, with a fixed initial capacity. This store must have the capability to store a list of song-user pairs, with each song linked to a user. It should also be able to fetch recently played songs based on the user and eliminate the least recently played songs when the store becomes full.</p>
    <h2>Features</h2>
    <ul>
        <li>In-memory store with fixed capacity for recently played songs per user.</li>
        <li>Automatically removes the least recently played songs when capacity is reached.</li>
    </ul>
    <h2>Prerequisites</h2>
    <ul>
        <li>Java Development Kit (JDK) 8 or later</li>
        <li>Maven (for dependency management)</li>
    </ul>
    <h2>Setup and Execution</h2>
    <ol>
        <li><b>Clone the Repository</b>
            <pre><code>git clone https://github.com/basma3121/in-memory-store-recently-played-songs.git
cd in-memory-store-recently-played-songs
            </code></pre>
        </li>
         <li><b>Install Dependencies</b>
            <p>This project uses Maven for dependency management. Ensure you have Maven installed, then run:</p>
            <pre><code>mvn clean install
            </code></pre>
        </li>
         <li><b>Run the Application</b>
            <p>You can run the application using Maven.</p>
            <p><b>Using Maven:</b></p>
            <pre><code>mvn exec:java -Dexec.mainClass="Main"
            </code></pre></li>

           
