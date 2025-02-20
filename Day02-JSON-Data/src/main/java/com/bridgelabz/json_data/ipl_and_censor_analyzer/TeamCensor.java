package com.bridgelabz.json_data.ipl_and_censor_analyzer;

class TeamCensor {
    public String censorTeamName(String teamName) {
        String[] words = teamName.split(" ");
        if (words.length > 1) {
            words[words.length - 1] = "***";
        }
        return String.join(" ", words);
    }
}