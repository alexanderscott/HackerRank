// https://www.hackerrank.com/challenges/classes-objects

// Write your Student class here

class Student {
private:
    vector<int> scores;
    
public:
    void input() {
        int i;
        for (int i = 0; i < 5; i++) {
            int tmp;
            cin >> tmp;
            scores.push_back(tmp);
        }
    }
    
    int calculateTotalScore() {
        return std::accumulate(scores.begin(), scores.end(), 0);
    }
};
