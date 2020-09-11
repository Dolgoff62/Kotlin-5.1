package ru.netology

fun main() {

    val firstPost = Post(
        ownerId = 555,
        fromId = 12,
        createdBy = 567,
        date = 2020_09_01,
        text = "Hello, its my first post.",
        replyOwnerId = 0,
        replyPostId = 0,
        friendsOnly = false,
        comments = "",
        copyright = "",
        likes = 10,
        repost = null,
        views = 15,
        postType = "",
        signerId = 0,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = true,
        postponedId = 0
    )

    val secondPost = Post(
        ownerId = 123,
        fromId = 0,
        createdBy = 500,
        date = 2020_09_02,
        text = "Hello, its my second post.",
        replyOwnerId = 0,
        replyPostId = 0,
        friendsOnly = false,
        comments = "",
        copyright = "",
        likes = 0,
        repost = null,
        views = 0,
        postType = "",
        signerId = 0,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        postponedId = 0
    )

    val thirdPost = Post(
        ownerId = 321,
        fromId = 98,
        createdBy = 987,
        date = 2020_07_15,
        text = "Hello, its my third post.",
        replyOwnerId = 0,
        replyPostId = 0,
        friendsOnly = false,
        comments = "",
        copyright = "",
        likes = 100,
        repost = null,
        views = 15,
        postType = "",
        signerId = 0,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = true,
        postponedId = 0
    )

    val updatedPost = Post(
        id = 1,
        ownerId = 555,
        fromId = 12,
        createdBy = 567,
        date = 2020_09_01,
        text = "This is a Edited Post",
        replyOwnerId = 0,
        replyPostId = 0,
        friendsOnly = false,
        comments = "",
        copyright = "",
        likes = 55,
        repost = thirdPost,
        views = 154,
        postType = "",
        signerId = 0,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = true,
        postponedId = 0)

    WallService.add(firstPost)
    WallService.add(secondPost)
    WallService.add(thirdPost)

    WallService.update(updatedPost)
    println(WallService.update(updatedPost))

    WallService.printPosts()
}