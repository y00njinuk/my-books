package chapter4

interface User { val nickname: String }

class PrivateUser(override val nickname: String): User
class SubscribingUser(val email: String): User {
    override val nickname: String
        get() = email.substringBefore('@')
}
class FacebookUser(val accountId: Int): User {
    override val nickname = getFaceBookName(accountId)
    private fun getFaceBookName(accountId: Int): Nothing =
        TODO("Not Implemented yet")
}