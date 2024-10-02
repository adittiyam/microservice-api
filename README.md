# Microservice API

## Deskripsi
Proyek ini adalah API untuk mengelola saluran dengan menggunakan Spring Boot dan JPA.

## Endpoints
- GET `/api/channels` - Mengambil semua saluran.
- POST `/api/channels` - Membuat saluran baru.
- PUT `/api/channels/{id}` - Memperbarui saluran berdasarkan ID.
- DELETE `/api/channels/{id}` - Menghapus saluran berdasarkan ID.

## Cara Menggunakan
1. Jalankan aplikasi.
2. Akses API di `http://localhost:8080/api/channels`.

## Dokumentasi API
- [Swagger UI](http://localhost:8080/swagger-ui.html) - Jika menggunakan Swagger untuk dokumentasi API.


Berikut adalah dokumentasi API yang disesuaikan dengan kode `ChannelController` dan `ChannelService` yang diberikan. Dokumentasi ini mencakup detail tentang setiap endpoint yang tersedia di API :

### Dokumentasi API untuk Channel

API ini menyediakan endpoint untuk mengelola saluran. Berikut adalah detail dari endpoint yang tersedia:

#### 1. Mengambil Semua Saluran
- Endpoint: `GET /api/channels`
- Deskripsi: Mengambil daftar semua saluran yang tersedia.
- Response:
  - Status Code: `200 OK`
  - Body:
    ```json
    [
        {
            "id": 1,
            "name": "Saluran 1",
            "description": "Deskripsi Saluran 1"
        },
        {
            "id": 2,
            "name": "Saluran 2",
            "description": "Deskripsi Saluran 2"
        }
    ]
    ```

#### 2. Membuat Saluran Baru
- Endpoint: `POST /api/channels`
- Deskripsi: Membuat saluran baru.
- Request Body:
  - Format:
    ```json
    {
        "name": "Saluran Baru",
        "description": "Deskripsi Saluran Baru"
    }
    ```
- Response:
  - Status Code: `200 OK`
  - Body:
    ```json
    {
        "id": 3,
        "name": "Saluran Baru",
        "description": "Deskripsi Saluran Baru"
    }
    ```

#### 3. Memperbarui Saluran
- Endpoint: `PUT /api/channels/{id}`
- Deskripsi: Memperbarui saluran yang sudah ada berdasarkan ID.
- Request Body:
  - Format:
    ```json
    {
        "name": "Saluran Diperbarui",
        "description": "Deskripsi Saluran Diperbarui"
    }
    ```
- Response:
  - Status Code: `200 OK`
  - Body:
    ```json
    {
        "id": 1,
        "name": "Saluran Diperbarui",
        "description": "Deskripsi Saluran Diperbarui"
    }
    ```

#### 4. Menghapus Saluran
- Endpoint: `DELETE /api/channels/{id}`
- Deskripsi: Menghapus saluran berdasarkan ID.
- Response:
  - Status Code: `204 No Content`
  - Body: 
    - Tidak ada konten dalam respons ini.
