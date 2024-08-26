package com.example.thesocialnetwork.exmaples

enum class PostType {
    Link,
    Stream,
    Suggestion,
}
enum class Reactions {
    Like,
    Dislike,
    Hearth,
    Sad,
    Happy,
    Glad,

}


data class Post(
    val type: PostType,
    val Reactions :ArrayList<Reactions>

)
fun main000() {
    val streamPost = Post(
        PostType.Stream,
        arrayListOf(
            Reactions.Hearth,
            Reactions.Sad,
            Reactions.Happy,
            Reactions.Glad,
            Reactions.Dislike,
            Reactions.Hearth,
            Reactions.Sad,
            Reactions.Happy,
            Reactions.Glad,
            Reactions.Dislike,
            Reactions.Hearth,
            Reactions.Sad,
            Reactions.Happy,
            Reactions.Glad,
            Reactions.Dislike,
            Reactions.Hearth,
            Reactions.Sad,
            Reactions.Happy,
            Reactions.Glad,
            Reactions.Dislike,
        )
    )
    println(streamPost)
}


