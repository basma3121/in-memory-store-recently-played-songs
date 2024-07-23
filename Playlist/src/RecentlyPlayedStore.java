import java.util.*;

public class RecentlyPlayedStore {
    private final int capacity;
    private final Map<String, LinkedHashMap<String, Song>> userSongsMap;

    public RecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        this.userSongsMap = new HashMap<>();
    }

    public void playSong(String userId, String songId) {
        if (!userSongsMap.containsKey(userId)) {
            userSongsMap.put(userId, new LinkedHashMap<>(capacity, 0.75f, true));
        }

        LinkedHashMap<String, Song> songMap = userSongsMap.get(userId);

        if (songMap.containsKey(songId)) {
            songMap.remove(songId);
        } else if (songMap.size() >= capacity) {
            String firstKey = songMap.keySet().iterator().next();
            songMap.remove(firstKey);
        }

        songMap.put(songId, new Song(songId, userId));
    }

    public List<String> getRecentlyPlayedSongs(String userId) {
        if (!userSongsMap.containsKey(userId)) {
            return Collections.emptyList();
        }

        LinkedHashMap<String, Song> songMap = userSongsMap.get(userId);
        return new ArrayList<>(songMap.keySet());
    }
}
