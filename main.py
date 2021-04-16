
from pymongo import MongoClient
from bson import ObjectId

# Crea conexión con la base de datos
mongo_client = MongoClient(port = 27017)

# Creación de la base de datos
db = mongo_client.crud

# Creación / conexión con la colección
contacto_collection = db.contacto

# Captura desde el teclado
nombre = input("Nombre: ")
a_paterno = input("A. Paterno: ")
a_materno = input("A. Materno: ")

# Enviar los datos a la base de datos(MongoDB)
contacto_collection.insert_one({"nombre": nombre, "a_paterno": a_paterno,"a_materno": a_materno})

# Consulta
contacto_data_set = contacto_collection.find()

# Ciclo para recorrer el dataset
for contacto_row in contacto_data_set:
    print(contacto_row)

print("Registro buscado: ")
print(contacto_collection.find_one({"_id":ObjectId(contacto_row.get("_id"))}))

# Update
contacto_collection.update_one({"_id": ObjectId(contacto_row.get("_id"))}, {"$set": {"nombre": "ABCD"}})

# Delete
contacto_collection.delete_one({"_id": ObjectId(contacto_row.get("_id"))})