package ic.saeroyi.dbpub.frbs

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class FireBreath {
    lateinit var databaseReference: DatabaseReference
    fun getDtBs(): DatabaseReference {
        val database = FirebaseDatabase.getInstance()
        databaseReference = database.getReference("JumpingCode")
        return databaseReference
    }
}